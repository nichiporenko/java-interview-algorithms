module.exports = {
  branches: ["main"],
  plugins: [
    ["@semantic-release/commit-analyzer", {
      "releaseRules": [
        { "type": "fix", "release": "patch" },
        { "type": "refactor", "release": "patch" },
        { "type": "chore", "release": "patch" },
        { "type": "perf", "release": "patch" },
        { "type": "build", "release": "patch" },
        { "type": "feat", "release": "minor" },
        { "type": "ops", "release": "minor" },
        { "type": "ci", "release": "minor" }
      ]
    }],
    "@semantic-release/release-notes-generator",
    ["@semantic-release/github", {
      "successComment": false,
      "failTitle": false
    }]
  ]
};